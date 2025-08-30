{pkgs}: {
  deps = [
    pkgs.xorg.makedepend
    pkgs.haskellPackages.makefile
    pkgs.sbclPackages.make-hash
  ];
}
