# Kotlin Mutable List Map Unexpected Behavior

This example demonstrates an often-misunderstood aspect of the `map` function when used with mutable lists in Kotlin.  The `map` function creates a *new* list containing the transformed elements, it does *not* modify the original list in place.

Therefore, changes to the original list after calling `map` will not be reflected in the mapped list, which is a common source of confusion for new Kotlin developers.  The solution demonstrates how to handle this scenario correctly, using a different approach if a mutable, updated mapped list is required.
