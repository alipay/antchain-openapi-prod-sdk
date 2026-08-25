<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ThingModelFeatureResponse extends Model {
    protected $_name = [
        'featureId' => 'feature_id',
        'identifier' => 'identifier',
        'name' => 'name',
        'eventProperties' => 'event_properties',
    ];
    public function validate() {
        Model::validateRequired('featureId', $this->featureId, true);
        Model::validateRequired('identifier', $this->identifier, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('eventProperties', $this->eventProperties, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->featureId) {
            $res['feature_id'] = $this->featureId;
        }
        if (null !== $this->identifier) {
            $res['identifier'] = $this->identifier;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->eventProperties) {
            $res['event_properties'] = $this->eventProperties;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ThingModelFeatureResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['feature_id'])){
            $model->featureId = $map['feature_id'];
        }
        if(isset($map['identifier'])){
            $model->identifier = $map['identifier'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['event_properties'])){
            $model->eventProperties = $map['event_properties'];
        }
        return $model;
    }
    /**
     * @example 
     * @var string
     */
    public $featureId;

    /**
     * @example 
     * @var string
     */
    public $identifier;

    /**
     * @example 
     * @var string
     */
    public $name;

    /**
     * @example 
     * @var string
     */
    public $eventProperties;

}
