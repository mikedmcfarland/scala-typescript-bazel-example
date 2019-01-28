
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

scala_library(
    name = "lib-code",
    srcs = glob(["*.scala"]),
    visibility = ["//visibility:public"]
)

scala_test(
  name = "test",
  srcs = glob(["test/*.scala"]),
  deps = ["lib-code"]
)
