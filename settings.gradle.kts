/*
 * Copyright (c) 2019 Owain van Brakel <https:github.com/Owain94>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

rootProject.name = "OpenOSRS Plugins"

include(":customboar")

include(":achievementdiary")
include(":agility")
include(":alchemicalhydra")
include(":ammo")
include(":animsmoothing")
include(":antidrag")
include(":aoewarnings")
include(":attackstyles")
include(":bank")
include(":banktags")
include(":banlist")
include(":barrows")
include(":blackjack")
include(":blastfurnance")
include(":blastmine")
include(":boosts")
include(":bosstimer")
include(":bosstimetracker")
include(":bronzeman")
include(":camera")
include(":cannon")
include(":cerberus")
include(":chatcommands")
include(":chatfilter")
include(":chathistory")
include(":chatnotifications")
include(":chattranslation")
include(":clanmanmode")
include(":barbarianassault")
include(":clanchat")
include(":cluescroll")
include(":combatlevel")
include(":cooking")
include(":corp")
include(":coxhelper")
include(":customclientresizing")
include(":customcursor")
include(":dailytaskindicators")
include(":deathindicator")
include(":defaultworld")
include(":demonicgorilla")
include(":devtools")
include(":discord")
include(":dropparty")
include(":dynamicmaxhit")
include(":effecttimers")
include(":emojis")
include(":entityhider")
include(":equipmentinspector")
include(":examine")
include(":experiencedrop")
include(":fairyring")
include(":feed")
include(":fightcave")
include(":fishing")
include(":fps")
include(":friendlist")
include(":friendnotes")
include(":friendtagging")
include(":gauntlet")
include(":gpu")
include(":grandexchange")
include(":grotesqueguardians")
include(":grounditems")
include(":groundmarkers")
include(":herbiboar")
include(":hideprayers")
include(":hideunder")
include(":highscore")
include(":highalchemy")
include(":hunter")
include(":hydra")
include(":idlenotifier")
include(":implings")
include(":inferno")
include(":instancemap")
include(":interfacestyles")
include(":inventorygrid")
include(":inventorytags")
include(":inventoryviewer")
include(":itemcharges")
include(":itemidentification")
include(":itemprices")
include(":itemskeptondeath")
include(":itemstats")
include(":keyremapping")
include(":kingdomofmiscellania")
include(":kourendlibrary")
include(":learntoclick")
include(":lizardmenshaman")
include(":loginscreen")
include(":lootassist")
include(":loottracker")
include(":lowmemory")
include(":menuentryswapper")
include(":maxhit")
include(":metronome")
include(":minimap")
include(":mining")
include(":motherlode")
include(":mousehighlight")
include(":mta")
include(":multiindicators")
include(":music")
include(":nightmarezone")
include(":notes")
include(":npchighlight")
include(":npcstatus")
include(":npcunaggroarea")
include(":objectindicators")
include(":opponentinfo")
include(":party")
include(":performancestats")
include(":pestcontrol")
include(":pileindicators")
include(":playerindicators")
include(":playerinfo")
include(":playerscouter")
include(":poh")
include(":poison")
include(":prayagainstplayer")
include(":prayer")
include(":prayeralert")
include(":privateserver")
include(":profiles")
include(":puzzlesolver")
include(":pvptools")
include(":pyramidplunder")
include(":questlist")
include(":raids")
include(":raidsthieving")
include(":randomevents")
include(":reminders")
include(":reorderprayers")
include(":reportbutton")
include(":roguesden")
include(":runecraft")
include(":runedoku")
include(":runepouch")
include(":screenmarkers")
include(":screenshot")
include(":shayzieninfirmary")
include(":skillcalculator")
include(":skybox")
include(":slayer")
include(":slayermusiq")
include(":smelting")
include(":spawntimer")
include(":specbar")
include(":specialcounter")
include(":spellbook")
include(":statusbars")
include(":statusorbs")
include(":stealingartefacts")
include(":stretchedmode")
include(":strongholdofsecurity")
include(":suppliestracker")
include(":tarnslair")
include(":teamcapes")
include(":theatre")
include(":tearsofguthix")
include(":templetrekking")
include(":thieving")
include(":tickcounter")
include(":ticktimers")
include(":tileindicators")
include(":timers")
include(":timestamp")
include(":timetracking")
include(":tithefarm")
include(":tmorph")
include(":tobdamagecount")
include(":twitch")
include(":vetion")
include(":virtuallevels")
include(":vorkath")
include(":whalewatchers")
include(":wiki")
include(":wildernesslocations")
include(":wintertodt")
include(":woodcutting")
include(":worldhopper")
include(":worldmap")
include(":xpglobes")
include(":xptracker")
include(":xpupdater")
include(":zalcano")
include(":zulrah")

for (project in rootProject.children) {
    project.apply {
        projectDir = file(name)
        buildFileName = "$name.gradle.kts"

        require(projectDir.isDirectory) { "Project '${project.path} must have a $projectDir directory" }
        require(buildFile.isFile) { "Project '${project.path} must have a $buildFile build script" }
    }
}
