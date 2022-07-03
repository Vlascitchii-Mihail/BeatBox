package com.bignerdranch.android.criminalintent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 92\u00020\u0001:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0007H\u0002J\u0012\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.H\u0002J\b\u00100\u001a\u00020\u001dH\u0016J\b\u00101\u001a\u00020\u001dH\u0016J\u001a\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u00104\u001a\u00020\u001dH\u0002J\b\u00105\u001a\u00020\u001dH\u0002J\u0010\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0002J\b\u00108\u001a\u00020\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/bignerdranch/android/criminalintent/CrimeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callButton", "Landroid/widget/Button;", "callPermissionRequestLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "contactsPermissionRequestLauncher", "crime", "Lcom/bignerdranch/android/criminalintent/Crime;", "crimeDetailViewModel", "Lcom/bignerdranch/android/criminalintent/CrimeDetailViewModel;", "getCrimeDetailViewModel", "()Lcom/bignerdranch/android/criminalintent/CrimeDetailViewModel;", "crimeDetailViewModel$delegate", "Lkotlin/Lazy;", "dateButton", "pickContact", "Ljava/lang/Void;", "reportButton", "solvedCheckBox", "Landroid/widget/CheckBox;", "suspectButton", "timeButton", "titleField", "Landroid/widget/EditText;", "askUserForOpeningCallSettings", "", "askUserForOpeningContactSettings", "getContactNameAndID", "uri", "Landroid/net/Uri;", "getCrimeReport", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onGotPermissionCall", "granted", "", "onGotPermissionContact", "onStart", "onStop", "onViewCreated", "view", "permissionCallGranted", "permissionContactsGranted", "phoneNumber", "str", "updateUI", "Companion", "app_debug"})
public final class CrimeFragment extends androidx.fragment.app.Fragment {
    private com.bignerdranch.android.criminalintent.Crime crime;
    private android.widget.EditText titleField;
    private android.widget.Button dateButton;
    private android.widget.Button timeButton;
    private android.widget.Button reportButton;
    private android.widget.Button suspectButton;
    private android.widget.Button callButton;
    private android.widget.CheckBox solvedCheckBox;
    private final kotlin.Lazy crimeDetailViewModel$delegate = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> callPermissionRequestLauncher = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> contactsPermissionRequestLauncher = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.Void> pickContact = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.bignerdranch.android.criminalintent.CrimeFragment.Companion Companion = null;
    
    public CrimeFragment() {
        super();
    }
    
    private final com.bignerdranch.android.criminalintent.CrimeDetailViewModel getCrimeDetailViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void onGotPermissionCall(boolean granted) {
    }
    
    private final void permissionCallGranted() {
    }
    
    private final void askUserForOpeningCallSettings() {
    }
    
    private final void onGotPermissionContact(boolean granted) {
    }
    
    private final void permissionContactsGranted() {
    }
    
    private final void askUserForOpeningContactSettings() {
    }
    
    private final void getContactNameAndID(android.net.Uri uri) {
    }
    
    private final java.lang.String phoneNumber(java.lang.String str) {
        return null;
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    private final void updateUI() {
    }
    
    private final java.lang.String getCrimeReport() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/bignerdranch/android/criminalintent/CrimeFragment$Companion;", "", "()V", "newInstance", "Lcom/bignerdranch/android/criminalintent/CrimeFragment;", "crimeId", "Ljava/util/UUID;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bignerdranch.android.criminalintent.CrimeFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.util.UUID crimeId) {
            return null;
        }
    }
}