#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")"
temporario=$(mktemp -d)
trap 'rm -rf -- "$temporario"' EXIT

for origem in padroes-*/*/src; do
    pasta=${origem%/src}
    destino="$temporario/$pasta"
    mkdir -p "$destino"
    printf '\n== %s ==\n' "$pasta"
    javac -encoding UTF-8 -d "$destino" "$origem"/*.java
    java -cp "$destino" Main
done
