# Captain Game with easy Compose
- Kotlin practice from *Learn Android 14 App Development* by Denis Panjuta (Udemy) 
- Section 6:  emember, {mutableStateOf()}

## What I learned
- `mutableStateOf` — creates a State object that Compose watches for changes
- Two ways to write the same thing (tried both, commented one out to compare):

​```
val treasuresFound = remember { mutableStateOf(0) }
treasuresFound.value += 1
​```

vs

​```
val treasuresFound by remember { mutableStateOf(0) }
treasuresFound += 1
​```

- `by` — shorthand that skips writing `.value` every time; both versions trigger Recomposition the same way
- Tested on emulator (not `@Preview`) — UI updated correctly when treasuresFound changed
