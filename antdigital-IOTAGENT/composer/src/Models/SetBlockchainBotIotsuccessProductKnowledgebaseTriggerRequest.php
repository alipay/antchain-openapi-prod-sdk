<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'kbId' => 'kb_id',
        'combine' => 'combine',
        'keywords' => 'keywords',
        'intents' => 'intents',
        'entities' => 'entities',
    ];
    public function validate() {
        Model::validateRequired('kbId', $this->kbId, true);
        Model::validateRequired('combine', $this->combine, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->kbId) {
            $res['kb_id'] = $this->kbId;
        }
        if (null !== $this->combine) {
            $res['combine'] = $this->combine;
        }
        if (null !== $this->keywords) {
            $res['keywords'] = $this->keywords;
        }
        if (null !== $this->intents) {
            $res['intents'] = $this->intents;
        }
        if (null !== $this->entities) {
            $res['entities'] = $this->entities;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SetBlockchainBotIotsuccessProductKnowledgebaseTriggerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['kb_id'])){
            $model->kbId = $map['kb_id'];
        }
        if(isset($map['combine'])){
            $model->combine = $map['combine'];
        }
        if(isset($map['keywords'])){
            if(!empty($map['keywords'])){
                $model->keywords = $map['keywords'];
            }
        }
        if(isset($map['intents'])){
            if(!empty($map['intents'])){
                $model->intents = $map['intents'];
            }
        }
        if(isset($map['entities'])){
            if(!empty($map['entities'])){
                $model->entities = $map['entities'];
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $kbId;

    // 枚举:ANY,ALL
    /**
     * @var string
     */
    public $combine;

    /**
     * @var string[]
     */
    public $keywords;

    /**
     * @var string[]
     */
    public $intents;

    /**
     * @var string[]
     */
    public $entities;

}
