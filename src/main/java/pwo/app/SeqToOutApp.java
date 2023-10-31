/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.app;


import pwo.utils.SequenceTools;

/**
 *
 * @author nadyasimakovich
 */
public class SeqToOutApp extends SeqToFileApp {
    
@Override
protected boolean getArgs(String[] args) {
    if(super.getArgs(args)) return true;
    return seqType != null && from >= 0 && to >= 0;
}
@Override
protected boolean wirteSeq() {
    System.out.println(SequenceTools.getTermsAsColumn(
                      seqType.getGenerator(), from, to));
    return true;
} 
 @Override
   public void run(String[] args) {
    System.out.println("Sequence to terminal CLI app");
    if (!getArgs(args)) {
        System.out.println("!Illegal arguments\n"+ "Legal usage: seqName from to");
        return;
    }
    wirteSeq();
 }
}
