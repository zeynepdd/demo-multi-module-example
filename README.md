# demo-multi-module-example
Demo project to showcase our technology

[![CircleCI](https://circleci.com/gh/mobileaction/demo-multi-module-example.svg?style=svg&circle-token=dda94ff355a98dd4269edde98d205351dc9451b8)](https://circleci.com/gh/mobileaction/demo-multi-module-example)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/2ca7d6856fd542f0b94b8272d7334890)](https://www.codacy.com?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=mobileaction/demo-multi-module-example&amp;utm_campaign=Badge_Grade)
[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/2ca7d6856fd542f0b94b8272d7334890)](https://www.codacy.com?utm_source=github.com&utm_medium=referral&utm_content=mobileaction/demo-multi-module-example&utm_campaign=Badge_Coverage)

#### Queues
```
ma-example-request-queue
ma-example-result-queue
ma-example-result-problem-queue
ma-example-request-problem-queue
```

#### Endpoint 1 - Queue-posts
```
POST /api/admin/queue/posts
Host: localhost:${PORT}
Authorization: Basic base64(username:password)
Content-Type: application/json
```

#### Endpoint 2 - Get Posts
```
GET /api/posts
Host: localhost:${PORT}
Authorization: Basic base64(username:password)
Content-Type: application/json
```

#### Endpoint 3 - Delete Post By ID
```
DELETE /api/posts/{postId}
Host: localhost:${PORT}
Authorization: Basic base64(username:password)
```
