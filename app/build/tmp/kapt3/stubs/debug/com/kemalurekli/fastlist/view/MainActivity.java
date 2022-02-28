package com.kemalurekli.fastlist.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/kemalurekli/fastlist/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "binding", "Lcom/kemalurekli/fastlist/databinding/ActivityMainBinding;", "toggle", "Landroidx/appcompat/app/ActionBarDrawerToggle;", "getToggle", "()Landroidx/appcompat/app/ActionBarDrawerToggle;", "setToggle", "(Landroidx/appcompat/app/ActionBarDrawerToggle;)V", "HideMenuItemsBeforeSignIn", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.kemalurekli.fastlist.databinding.ActivityMainBinding binding;
    public androidx.appcompat.app.ActionBarDrawerToggle toggle;
    private com.google.firebase.auth.FirebaseAuth auth;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.ActionBarDrawerToggle getToggle() {
        return null;
    }
    
    public final void setToggle(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.ActionBarDrawerToggle p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void HideMenuItemsBeforeSignIn() {
    }
}