package com.NPCOverheadDialogue.dialog;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DialogCategories
{
    BANDOS(
            new String[]{"!gamble all", "!watchtime"},
            new String[]{"Qneeks BCP owner? I don't think so champion.", "*wahhh* *wahhh*", "NoBitches", "No BCP?", "*wahhh*", "qneeksTalkingAboutEmotesAgain"},
            new String[]{"MAN I GotCaughtTrolling"},
            new String[]{"!gamble all", "!watchtime"}),
    ;

    private final String[] ambientDialogs;
    private final String[] damageDialogs;
    private final String[] deathDialogs;
    private final String[] walkingDialogs;
}