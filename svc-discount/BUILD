
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

scala_binary(
    name = "svc-discount",
    srcs = glob(["*.scala"]),
    deps = [
      "//3rdparty/jvm/com/twitter:algebird_core",
      "//lib-code"
    ],
    main_class = "com.thrownforaloop.discount.SvcDiscount"
)
