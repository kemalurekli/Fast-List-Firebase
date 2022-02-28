package com.kemalurekli.fastlist;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class AppGraphDirections {
  private AppGraphDirections() {
  }

  @NonNull
  public static NavDirections actionGlobalProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_global_profileFragment);
  }
}
