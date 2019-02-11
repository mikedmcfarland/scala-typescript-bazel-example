workspace(name = "scala_typescript_example")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

rules_scala_version="a89d44f7ef67d93dedfc9888630f48d7723516f7" # update this as needed

http_archive(
    name = "io_bazel_rules_scala",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
    type = "zip",
    strip_prefix= "rules_scala-%s" % rules_scala_version
)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

# register default scala toolchain
load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()


# http_archive(
# 	name = "trans_maven_jar",
# 	url = "https://github.com/bazelbuild/migration-tooling/archive/master.zip",
# 	type = "zip",
# 	strip_prefix = "migration-tooling-master",
# )

# load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")
# git_repository(
#     name = "bazel_deps",
#     remote = "https://github.com/johnynek/bazel-deps.git",
#     commit = "3fdaaa6de3ed8cf010a6b1713a04d55c4abb2592"
# )



load("//3rdparty:workspace.bzl", "maven_dependencies")
maven_dependencies()
