/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decorator.designpattern;

/**
 *
 * @author Masudur Rahman <masud.java@gmail.com>
 */
public interface Report {
    public Object[][] getReportData(final String reportId);
    public String getFirstColumnData();
}