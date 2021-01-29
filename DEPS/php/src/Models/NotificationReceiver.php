<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class NotificationReceiver extends Model {
    protected $_name = [
        'configId' => 'config_id',
        'receiver' => 'receiver',
        'description' => 'description',
        'id' => 'id',
    ];
    public function validate() {
        Model::validateRequired('configId', $this->configId, true);
        Model::validateRequired('receiver', $this->receiver, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('id', $this->id, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->configId) {
            $res['config_id'] = $this->configId;
        }
        if (null !== $this->receiver) {
            $res['receiver'] = $this->receiver;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NotificationReceiver
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['config_id'])){
            $model->configId = $map['config_id'];
        }
        if(isset($map['receiver'])){
            $model->receiver = $map['receiver'];
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        return $model;
    }
    // config id
    /**
     * @example 123
     * @var string
     */
    public $configId;

    // receiver
    /**
     * @example test
     * @var string
     */
    public $receiver;

    // description
    /**
     * @example test
     * @var string
     */
    public $description;

    // id
    /**
     * @example 123
     * @var string
     */
    public $id;

}
