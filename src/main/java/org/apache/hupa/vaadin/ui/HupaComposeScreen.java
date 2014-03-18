package org.apache.hupa.vaadin.ui;

import org.vaadin.tokenfield.TokenField;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.shared.ui.combobox.FilteringMode;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Upload;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class HupaComposeScreen extends CustomComponent {

    /*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */
    
    @AutoGenerated
    private AbsoluteLayout mainLayout;
    @AutoGenerated
    private VerticalLayout vMain;
    @AutoGenerated
    private HorizontalLayout hButtons;
    @AutoGenerated
    private Button bSend;
    @AutoGenerated
    private Button bCancel;
    @AutoGenerated
    private VerticalLayout vCompose;
    @AutoGenerated
    private HorizontalLayout hCompose;
    @AutoGenerated
    private VerticalLayout vAttach;
    @AutoGenerated
    private Upload fUpload;
    @AutoGenerated
    private RichTextArea tBody;
    @AutoGenerated
    private TextField tSubject;
    @AutoGenerated
    private GridLayout gHeaders;
    @AutoGenerated
    private HorizontalLayout hBcc;
    @AutoGenerated
    private HorizontalLayout hCc;
    @AutoGenerated
    private HorizontalLayout hTo;
    @AutoGenerated
    private Label tFrom;
    private TokenField tfTo = new TokenField("To:");
    private TokenField tfCc = new TokenField("CC:");
    private TokenField tfBcc = new TokenField("BCC:");

    public HupaComposeScreen() {
        buildMainLayout();
        setCompositionRoot(mainLayout);
        hTo.addComponent(tfTo);
        hTo.setExpandRatio(tfTo, 1f);
        tfTo.setBuffered(true);
        tfTo.setFilteringMode(FilteringMode.CONTAINS);
        hCc.addComponent(tfCc);
        hCc.setExpandRatio(tfCc, 1f);
        tfCc.setBuffered(true);
        tfCc.setFilteringMode(FilteringMode.CONTAINS);
        hBcc.addComponent(tfBcc);
        hBcc.setExpandRatio(tfBcc, 1f);
        tfBcc.setBuffered(true);
        tfBcc.setFilteringMode(FilteringMode.CONTAINS);
        mainLayout.setSizeFull();
    }
    
    public Label gettFrom() {
        return tFrom;
    }    
    public TokenField getTfTo() {
        return tfTo;
    }
    public TokenField getTfCc() {
        return tfCc;
    }
    public TokenField getTfBcc() {
        return tfBcc;
    }
    public RichTextArea gettBody() {
        return tBody;
    }
    public TextField gettSubject() {
        return tSubject;
    }    
    public Button getbSend() {
        return bSend;
    }
    public Button getbCancel() {
        return bCancel;
    }
    
    @AutoGenerated
    private AbsoluteLayout buildMainLayout() {
        // common part: create layout
        mainLayout = new AbsoluteLayout();
        mainLayout.setImmediate(false);
        mainLayout.setWidth("100%");
        mainLayout.setHeight("100%");
        
        // top-level component properties
        setWidth("100.0%");
        setHeight("100.0%");
        
        // vMain
        vMain = buildVMain();
        mainLayout.addComponent(vMain,
                "top:0.0px;right:0.0px;bottom:0.0px;left:0.0px;");
        
        return mainLayout;
    }

    @AutoGenerated
    private VerticalLayout buildVMain() {
        // common part: create layout
        vMain = new VerticalLayout();
        vMain.setImmediate(false);
        vMain.setWidth("100.0%");
        vMain.setHeight("100.0%");
        vMain.setMargin(true);
        
        // vCompose
        vCompose = buildVCompose();
        vMain.addComponent(vCompose);
        vMain.setExpandRatio(vCompose, 1.0f);
        
        // hButtons
        hButtons = buildHButtons();
        vMain.addComponent(hButtons);
        
        return vMain;
    }

    @AutoGenerated
    private VerticalLayout buildVCompose() {
        // common part: create layout
        vCompose = new VerticalLayout();
        vCompose.setStyleName("compose");
        vCompose.setImmediate(false);
        vCompose.setWidth("100.0%");
        vCompose.setHeight("100.0%");
        vCompose.setMargin(true);
        vCompose.setSpacing(true);
        
        // gHeaders
        gHeaders = buildGHeaders();
        vCompose.addComponent(gHeaders);
        
        // tSubject
        tSubject = new TextField();
        tSubject.setStyleName("field");
        tSubject.setCaption("Subject:");
        tSubject.setImmediate(false);
        tSubject.setWidth("85.0%");
        tSubject.setHeight("-1px");
        vCompose.addComponent(tSubject);
        
        // hCompose
        hCompose = buildHCompose();
        vCompose.addComponent(hCompose);
        vCompose.setExpandRatio(hCompose, 1.0f);
        
        return vCompose;
    }

    @AutoGenerated
    private GridLayout buildGHeaders() {
        // common part: create layout
        gHeaders = new GridLayout();
        gHeaders.setImmediate(false);
        gHeaders.setWidth("100.0%");
        gHeaders.setHeight("-1px");
        gHeaders.setMargin(false);
        gHeaders.setColumns(2);
        gHeaders.setRows(2);
        
        // tFrom
        tFrom = new Label();
        tFrom.setStyleName("input");
        tFrom.setCaption("From:");
        tFrom.setImmediate(false);
        tFrom.setWidth("90.0%");
        tFrom.setHeight("24px");
        tFrom.setValue("me");
        gHeaders.addComponent(tFrom, 0, 0);
        gHeaders.setComponentAlignment(tFrom, new Alignment(9));
        
        // hTo
        hTo = new HorizontalLayout();
        hTo.setImmediate(false);
        hTo.setWidth("100.0%");
        hTo.setHeight("-1px");
        hTo.setMargin(false);
        hTo.setSpacing(true);
        gHeaders.addComponent(hTo, 1, 0);
        
        // hCc
        hCc = new HorizontalLayout();
        hCc.setImmediate(false);
        hCc.setWidth("100.0%");
        hCc.setHeight("-1px");
        hCc.setMargin(false);
        hCc.setSpacing(true);
        gHeaders.addComponent(hCc, 0, 1);
        
        // hBcc
        hBcc = new HorizontalLayout();
        hBcc.setImmediate(false);
        hBcc.setWidth("100.0%");
        hBcc.setHeight("-1px");
        hBcc.setMargin(false);
        hBcc.setSpacing(true);
        gHeaders.addComponent(hBcc, 1, 1);
        
        return gHeaders;
    }

    @AutoGenerated
    private HorizontalLayout buildHCompose() {
        // common part: create layout
        hCompose = new HorizontalLayout();
        hCompose.setImmediate(false);
        hCompose.setWidth("100.0%");
        hCompose.setHeight("100.0%");
        hCompose.setMargin(false);
        hCompose.setSpacing(true);
        
        // tBody
        tBody = new RichTextArea();
        tBody.setImmediate(false);
        tBody.setWidth("100.0%");
        tBody.setHeight("100.0%");
        hCompose.addComponent(tBody);
        hCompose.setExpandRatio(tBody, 1.0f);
        
        // vAttach
        vAttach = buildVAttach();
        hCompose.addComponent(vAttach);
        
        return hCompose;
    }

    @AutoGenerated
    private VerticalLayout buildVAttach() {
        // common part: create layout
        vAttach = new VerticalLayout();
        vAttach.setImmediate(false);
        vAttach.setWidth("100px");
        vAttach.setHeight("100.0%");
        vAttach.setMargin(false);
        vAttach.setSpacing(true);
        
        // fUpload
        fUpload = new Upload();
        fUpload.setCaption("Attachments");
        fUpload.setImmediate(false);
        fUpload.setWidth("100.0%");
        fUpload.setHeight("-1px");
        vAttach.addComponent(fUpload);
        
        return vAttach;
    }

    @AutoGenerated
    private HorizontalLayout buildHButtons() {
        // common part: create layout
        hButtons = new HorizontalLayout();
        hButtons.setImmediate(false);
        hButtons.setWidth("100.0%");
        hButtons.setHeight("40px");
        hButtons.setMargin(false);
        hButtons.setSpacing(true);
        
        // bCancel
        bCancel = new Button();
        bCancel.setCaption("Discard");
        bCancel.setImmediate(true);
        bCancel.setWidth("-1px");
        bCancel.setHeight("-1px");
        hButtons.addComponent(bCancel);
        hButtons.setExpandRatio(bCancel, 1.0f);
        hButtons.setComponentAlignment(bCancel, new Alignment(10));
        
        // bSend
        bSend = new Button();
        bSend.setCaption("Send");
        bSend.setImmediate(true);
        bSend.setWidth("-1px");
        bSend.setHeight("-1px");
        hButtons.addComponent(bSend);
        hButtons.setComponentAlignment(bSend, new Alignment(9));
        
        return hButtons;
    }

}