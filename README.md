# appoker
A tool for the visualisation and query of application graphs

# Communicating with PuppetDB
## Listing environments
http://localhost:8080/v4/environments

## Example output
[ {
  "name" : "provision"
}, {
  "name" : "forge"
}, {
  "name" : "production"
} ]

## Known nodes
http://localhost:8080/v4/nodes

## Resources
http://localhost:8080/v4/resources

# Method
1. Render environment graph
2. For each node in graph, render node
3. For each node, get resources
