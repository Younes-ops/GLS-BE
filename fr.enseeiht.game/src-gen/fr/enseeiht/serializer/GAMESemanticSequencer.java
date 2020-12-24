/*
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.serializer;

import com.google.inject.Inject;
import fr.enseeiht.gAME.Chemin;
import fr.enseeiht.gAME.Choix;
import fr.enseeiht.gAME.Condition;
import fr.enseeiht.gAME.Connaissance;
import fr.enseeiht.gAME.Description;
import fr.enseeiht.gAME.Explorateur;
import fr.enseeiht.gAME.GAMEPackage;
import fr.enseeiht.gAME.Interaction;
import fr.enseeiht.gAME.Jeu;
import fr.enseeiht.gAME.Lieu;
import fr.enseeiht.gAME.Objet;
import fr.enseeiht.gAME.Personne;
import fr.enseeiht.services.GAMEGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GAMESemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GAMEGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GAMEPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GAMEPackage.CHEMIN:
				sequence_Chemin(context, (Chemin) semanticObject); 
				return; 
			case GAMEPackage.CHOIX:
				sequence_Choix(context, (Choix) semanticObject); 
				return; 
			case GAMEPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case GAMEPackage.CONNAISSANCE:
				sequence_Connaissance(context, (Connaissance) semanticObject); 
				return; 
			case GAMEPackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case GAMEPackage.EXPLORATEUR:
				sequence_Explorateur(context, (Explorateur) semanticObject); 
				return; 
			case GAMEPackage.INTERACTION:
				sequence_Interaction(context, (Interaction) semanticObject); 
				return; 
			case GAMEPackage.JEU:
				sequence_Jeu(context, (Jeu) semanticObject); 
				return; 
			case GAMEPackage.LIEU:
				sequence_Lieu(context, (Lieu) semanticObject); 
				return; 
			case GAMEPackage.OBJET:
				sequence_Objet(context, (Objet) semanticObject); 
				return; 
			case GAMEPackage.PERSONNE:
				sequence_Personne(context, (Personne) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Chemin returns Chemin
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         descriptions=Description? 
	 *         depart=[Lieu|ID] 
	 *         arrive=[Lieu|ID] 
	 *         visibilite=Visibilite 
	 *         conditionsVisibilite=Condition
	 *     )
	 */
	protected void sequence_Chemin(ISerializationContext context, Chemin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Choix returns Choix
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Choix(ISerializationContext context, Choix semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GAMEPackage.Literals.CHOIX__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GAMEPackage.Literals.CHOIX__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GAMEPackage.Literals.CONDITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GAMEPackage.Literals.CONDITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Connaissance returns Connaissance
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Connaissance(ISerializationContext context, Connaissance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GAMEPackage.Literals.CONNAISSANCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GAMEPackage.Literals.CONNAISSANCE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Description returns Description
	 *
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_Description(ISerializationContext context, Description semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GAMEPackage.Literals.DESCRIPTION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GAMEPackage.Literals.DESCRIPTION__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescriptionAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Explorateur returns Explorateur
	 *
	 * Constraint:
	 *     (name=ID taille=INT objets+=[Objet|ID]* connaissances+=[Connaissance|ID]* localisation=[Lieu|ID])
	 */
	protected void sequence_Explorateur(ISerializationContext context, Explorateur semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Interaction returns Interaction
	 *
	 * Constraint:
	 *     choix+=Choix+
	 */
	protected void sequence_Interaction(ISerializationContext context, Interaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Jeu returns Jeu
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         explorateur=Explorateur 
	 *         lieux+=Lieu* 
	 *         Objets+=Objet* 
	 *         Connaissances+=Connaissance* 
	 *         personnes+=Personne* 
	 *         chemins+=Chemin*
	 *     )
	 */
	protected void sequence_Jeu(ISerializationContext context, Jeu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Lieu returns Lieu
	 *
	 * Constraint:
	 *     (name=ID descriptions+=Description? objets+=[Objet|ID]* connaissances+=[Connaissance|ID]* personnes+=[Personne|ID]*)
	 */
	protected void sequence_Lieu(ISerializationContext context, Lieu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Objet returns Objet
	 *
	 * Constraint:
	 *     (name=ID descriptions+=Description? taille=INT)
	 */
	protected void sequence_Objet(ISerializationContext context, Objet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Personne returns Personne
	 *
	 * Constraint:
	 *     (name=ID descriptions=Description interaction=Interaction visibilite=Visibilite conditionsVisibilite=Condition)
	 */
	protected void sequence_Personne(ISerializationContext context, Personne semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GAMEPackage.Literals.PERSONNE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GAMEPackage.Literals.PERSONNE__NAME));
			if (transientValues.isValueTransient(semanticObject, GAMEPackage.Literals.PERSONNE__DESCRIPTIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GAMEPackage.Literals.PERSONNE__DESCRIPTIONS));
			if (transientValues.isValueTransient(semanticObject, GAMEPackage.Literals.PERSONNE__INTERACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GAMEPackage.Literals.PERSONNE__INTERACTION));
			if (transientValues.isValueTransient(semanticObject, GAMEPackage.Literals.PERSONNE__VISIBILITE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GAMEPackage.Literals.PERSONNE__VISIBILITE));
			if (transientValues.isValueTransient(semanticObject, GAMEPackage.Literals.PERSONNE__CONDITIONS_VISIBILITE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GAMEPackage.Literals.PERSONNE__CONDITIONS_VISIBILITE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPersonneAccess().getDescriptionsDescriptionParserRuleCall_3_0(), semanticObject.getDescriptions());
		feeder.accept(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_4_0(), semanticObject.getInteraction());
		feeder.accept(grammarAccess.getPersonneAccess().getVisibiliteVisibiliteEnumRuleCall_5_0(), semanticObject.getVisibilite());
		feeder.accept(grammarAccess.getPersonneAccess().getConditionsVisibiliteConditionParserRuleCall_7_0(), semanticObject.getConditionsVisibilite());
		feeder.finish();
	}
	
	
}