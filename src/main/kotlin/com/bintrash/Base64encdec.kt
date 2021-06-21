package com.bintrash

import java.util.*

fun main() {
//    val value =
//        "ewogICJ0eXBlIjogInNlcnZpY2VfYWNjb3VudCIsCiAgInByb2plY3RfaWQiOiAicmwtY2ljZC1kZXYwMS0yIiwKICAicHJpdmF0ZV9rZXlfaWQiOiAiMzkzOTNhOThhYTdmZDBjMGY4YzNkOGZmM2FkNGNmYmFlODIxYmFlNiIsCiAgInByaXZhdGVfa2V5IjogIi0tLS0tQkVHSU4gUFJJVkFURSBLRVktLS0tLVxuTUlJRXZnSUJBREFOQmdrcWhraUc5dzBCQVFFRkFBU0NCS2d3Z2dTa0FnRUFBb0lCQVFDNVBwTzl1RmtYVnFvMVxuYkpLQjBTdUNFa2lMalh5RWxGS3krK3dTaG1WZEsrdkpZU1p0bCthVnJ4RlB6b2EwNlU4bUlLcnFPZHF2MmZtL1xuV2dYQ2tJaEhNdjhkVFY5ZEpkS0tZbXVrNlVNY0VNR2FWN2diY2ptQjJ0Nmc5WnZtdnpJU1dlSlltRlhMMk8yNVxuaVlFL3F4UEVPZGxBck1OYzN2QXNvNWtreW5WNVlOTXowNkIxbk5MZFltcTAyU09oMStJL21kZEZ0eTZ5NnM4aVxuTC9mbUhVVGZma3pLMjNXaEFjS1UvQVJSUVRCRUJNeEZOOGJ0SlNWN1o4RzNONFhvSnVCajUrZGNKN3RuY2xHMFxubmhHeU5paWFCY28yVm01NUlIZjA4dlcyUGtnQ1BJVU91cGs0NlZLcU5xN1ovNVhSSld3Mmh4ZWlRa3pob3o2NVxuckhiYzNEZDdBZ01CQUFFQ2dnRUFFekJIbERnaEI3NklkRzdzdGk4ajkwaWhqeU1oZjRlYkVXM3didkxRL29KcVxuM1k5Y3NGbUlkSCtQL0M1Wk1kV1djZmYyL0dXYklPck92ZzJRaElPb09qS0VKQUE4Y3FUL3JDb0p4ZFFMM3VwZ1xuR1BiTDNCRk1UUWFPVjlTdW5qWmhTaGxaZUVmcUMwQkxUNzdOK1U4UUJjYmdSRWQyYlRaWUMvMEpBMlh5eVVIRlxuM0JlNFp4Uk05UUxYcENiNThtd3J5V3FxUEJ6SS8xeVRnWDFGSWhSWkFwNjU4V3VUVFlFQTdhOUFEREs5emhMZVxuOG1aZWphb0w1Mk1rcWpzYThaTUdkdXB5SjZJcGpKRDhQeWQvK1F2OVBkKzRwQkx2NFlITjlzVU94cE82elk3QVxuNGtUWjYxWm10bmlEMnNybXZEaHhsbE9sZk94cy9pRldWUkxQeHhtbXNRS0JnUURsZ0plUk0zUWoycHhIVFlETFxuTHpzMG9BT2xONDl5NGlkVW8xN052YlpwYy9SWnBlOHlKNlRLVFBkYzdCNGx3bFovVVdmQjk0VWpXYlFjTng4YlxubXJTZHV4aGUrSUlzSkNQY3lLUEpXZTZKUVptUTFhVUxHZmdORm9hSTdwTEh3Q3BmczI3c1NuQVNCaG5tRXg0V1xuaTV1dHZuMjI5YWpLaW5rS3dUU083ZmV3M3dLQmdRRE9vZHFGNmZkMVVNUUFmMEZKMXNQZERZZ2hXN0xYWTNJeFxuaVd3SFExSXpoakozZWJBVGtTSk5WRFJOM2c0c3ZkY2p3Qm14bUJ0aTVEaGlKaURSWnFOQnROR0E2M0RTVyt4blxueXlFYlA1R1N3V1ZkM1EwTTBzTmY5aXJhR2lqL2NWbkhNYkx4ZXlVSUpOVTVSM0Z3N0xsM2hTTm5pb05kTUJXL1xuTGhsWkJCVUE1UUtCZ0d5QmJLZUl4U3RDYTByRzJOSzNwTzFQamdtcUNCZFAxenFMOXdHYzVVWmNQVFc1WHlxK1xuVllvVDg0dXFVdUtWVENIcjBmdUIxQitQaExrbVVuM1JtZjFNL012Q0FJRndJTWg4ei9zZG1zcW9DanZRMXJRMVxuOWZIeUtXOUtKSGx1WUZwWTBtUERHZE5ic1JqM0J1MnYyYzIrVjErT0s5eCt0WldoSFFGS2Z5WFBBb0dCQUtscVxuVU1WOUI5UWJEU2l2TFhPQjc0SzlSb0M3TTAyZmpwQUk4UmFmWHJVNThRUytNOXhISVkydlhWYittamFheTlyV1xuOVBvRUVXZ3FZQVF3NkxWblpyRkh0SUgwQjhPaGRKbkJGUHJIU3U2OVBBUVNhbEc2T0Uva2dFdmtLUHNQRDZIZlxuSUswVzMwem5EaDl4Y1JRNk12SklxYmVKL0p5YUFTcUhmR2JjanUvMUFvR0JBSWdSOUhzanVqcldad2Y2d2hIVlxuZlJSWFV6YTFNRXRxZ08raVRHR2VQTGU5cXo4WXZ6bXo0d3lyNGJYOGdkeTEyaitkWlBDbjVSVUZwWjFoMTZOWlxuVCs2dnV0MEtzUnFsSWR2KzIwdXpBbHJNbTNmN1VkTWdVcngwSGFWbHVBSE8vUnFYaG5NdytuNDFEKzFJNlA0N1xuYzZWZVFuY2c5MGlqVWJWTHljK09acXNMXG4tLS0tLUVORCBQUklWQVRFIEtFWS0tLS0tXG4iLAogICJjbGllbnRfZW1haWwiOiAiZG9jcHJvY3N0b3JhZ2VhZG1pbi1hekBybC1jaWNkLWRldjAxLTIuaWFtLmdzZXJ2aWNlYWNjb3VudC5jb20iLAogICJjbGllbnRfaWQiOiAiMTAyMzIzNTU0NzYwMTgzMDc4Nzc0IiwKICAiYXV0aF91cmkiOiAiaHR0cHM6Ly9hY2NvdW50cy5nb29nbGUuY29tL28vb2F1dGgyL2F1dGgiLAogICJ0b2tlbl91cmkiOiAiaHR0cHM6Ly9vYXV0aDIuZ29vZ2xlYXBpcy5jb20vdG9rZW4iLAogICJhdXRoX3Byb3ZpZGVyX3g1MDlfY2VydF91cmwiOiAiaHR0cHM6Ly93d3cuZ29vZ2xlYXBpcy5jb20vb2F1dGgyL3YxL2NlcnRzIiwKICAiY2xpZW50X3g1MDlfY2VydF91cmwiOiAiaHR0cHM6Ly93d3cuZ29vZ2xlYXBpcy5jb20vcm9ib3QvdjEvbWV0YWRhdGEveDUwOS9kb2Nwcm9jc3RvcmFnZWFkbWluLWF6JTQwcmwtY2ljZC1kZXYwMS0yLmlhbS5nc2VydmljZWFjY291bnQuY29tIgp9Cg=="
//    val decoded = Base64.getDecoder().decode(value)
//
//    println(decoded)

    val creds = """{
  "type": "service_account",
  "project_id": "rl-cicdv2-dev01-1",
  "private_key_id": "6205d65d4ef83fdac264d4d772fce275144af869",
  "private_key": "-----BEGIN PRIVATE KEY-----\nMIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDnpFjOV7LyiHIA\nKIFR1PykCSCVf60cugrZV/e0CP6GdXUeX2okDpa/Vlreqm2YGZ1gY3T50cftjuTs\nfM+7Lc32tSB7nlIegfCu+QF/FW6YE87uJ1MoC0hMiROYmxsDvQzd0HMRstXmJ4rM\n4VAN+i9+44u2k117gw4Q1RYoaIgvMVYZaQQOoJligSEq7/kYDiLJbNdnHOcQ4bp/\n6V4tz2sNBfLQIQR1dIWKLHw+UtkKYEHThtWnUrjy6s0MkFR4o3Jh8ymTGjjkLAgE\nn68FTJiSLgPN1kFvsuOPyuc4c+u/Dgys2HwV2dCIAwOngEmeNSM9l0zV5Ub+YTKO\nKrKTBdK9AgMBAAECggEAWZoWafa9dxh1dH82irdm5HLNYlbJWTfTs3/WBpOGFO/B\nVnbVAU6NXETkkIX/L5sU57CBEpNlkQw5nAqpdf+BUKF+h6LVpAxiU+RpAkYBihz7\nad7XSUGX/Vb2uAyjVf5eSDz2Dc4N9GGuTJMJGucAUUZmiECXpAutOLCcShQpPYtN\nClczvMMBDjGZvneQR2bm0JzAI86cVvCjJDz+WfK6KjTcKie6ITjpvYeW4F5/oDSE\n93p92G089JBV6t+SlzaEx8/YAKoLIROlGLagKJFCFfCNotpIX3czhpYXnfH8wLwH\nniFhCX9rz9bkuLHWYqW6rgRUznok3nk5Z2SOLlt5lwKBgQD6TTl7GCcYkw+0BHDJ\nsZ1GGUTNutrLId7hp9Z4jP4vz0Xa5P2AhIJEk3sEExQKlQit5S1hGLjiuBfslwVX\nkh4I9kBxfd8g1gDum6G8QFchfPq7wyka6e23PitZq96RwtQzZjWyq0KZfmyB7KP5\n4oM4LVK2Q3Ec0d2jkWYcZqTg9wKBgQDs6l9ZqYMaguaIiBRtXpUc+sSWA91TTYHf\nzuNP9H31bSwbgNgG3iM3YX2lMCeI42c/tdLuVGSNwBg+N0A8FVn5OAc+pjvMQqwd\na65UIFSHt8xyzKM2G2CnTfn+CPrQObUUzKg30Y9E+xHB4mFSbfs/6HHXSizBXHce\nV+bKCisw6wKBgQCjhFuu3OJ9nWU+1z/Po+b46n0WYaGZ3rC6fmkQLBvKpAAgtkQd\n93Ma1bYhvUz0dNRMtlFlAz+VbWrDtw1YXi6c8DK9cduYmfXV63pHf0jsqbcrfp2V\n5YjUkxrC5BLs6niyc21VIajKmdrNLgkZsC7FPmawh3KXv0qqFsy8dRn1lQKBgEFR\nuSpKXzgvAQqBokgpPKl5xjuqIxp1kyo2q1t/CD9jcza+BlGWa1U4juC9bxkBwZTC\nN764C+U9IjH9H7uxE1ZwCSdPw8rkUvnll3HgXA3zMe4w14ryb2qRSCyvIx/H2VI7\nvuFs6LhXFKVFGhoU8qHDH6gA7mf9a2Y1TA9GUHQzAoGBAOrWbsSTG5NY1CnkQoRE\n3gP0z0elHOs+HCSjronZcu15VUXvGQcroxS2PZKiIZwSPbdH4pjt6CoUh9Uus9gt\n8kRNsGdSdZR4HqflzjqTxuCeJOj/1ZUWbvwIJQmg9+/kn70I7ojYhIiSSXLCOlfN\nBbGNA1nT9GtsLGhr2F/Nruaw\n-----END PRIVATE KEY-----\n",
  "client_email": "pubsubeditor@rl-cicdv2-dev01-1.iam.gserviceaccount.com",
  "client_id": "109099885551209163194",
  "auth_uri": "https://accounts.google.com/o/oauth2/auth",
  "token_uri": "https://oauth2.googleapis.com/token",
  "auth_provider_x509_cert_url": "https://www.googleapis.com/oauth2/v1/certs",
  "client_x509_cert_url": "https://www.googleapis.com/robot/v1/metadata/x509/pubsubeditor%40rl-cicdv2-dev01-1.iam.gserviceaccount.com"
}
"""
    val encoded = Base64.getEncoder().encode(creds.toByteArray())

    println(encoded)
}