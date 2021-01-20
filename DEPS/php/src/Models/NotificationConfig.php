<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\NotificationReceiver;

class NotificationConfig extends Model {
    protected $_name = [
        'receivers' => 'receivers',
        'notificationType' => 'notification_type',
        'enabled' => 'enabled',
        'cloudWebUrl' => 'cloud_web_url',
        'id' => 'id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->receivers) {
            $res['receivers'] = [];
            if(null !== $this->receivers && is_array($this->receivers)){
                $n = 0;
                foreach($this->receivers as $item){
                    $res['receivers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->notificationType) {
            $res['notification_type'] = $this->notificationType;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->cloudWebUrl) {
            $res['cloud_web_url'] = $this->cloudWebUrl;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NotificationConfig
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['receivers'])){
            if(!empty($map['receivers'])){
                $model->receivers = [];
                $n = 0;
                foreach($map['receivers'] as $item) {
                    $model->receivers[$n++] = null !== $item ? NotificationReceiver::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['notification_type'])){
            $model->notificationType = $map['notification_type'];
        }
        if(isset($map['enabled'])){
            $model->enabled = $map['enabled'];
        }
        if(isset($map['cloud_web_url'])){
            $model->cloudWebUrl = $map['cloud_web_url'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        return $model;
    }
    // 接收人列表
    /**
     * @example 
     * @var NotificationReceiver[]
     */
    public $receivers;

    // 类型
    /**
     * @example EMAIL
     * @var string
     */
    public $notificationType;

    // 是否开启，默认不开启
    /**
     * @example true, false
     * @var bool
     */
    public $enabled;

    // cloud_web_url
    /**
     * @example test-url
     * @var string
     */
    public $cloudWebUrl;

    // id
    /**
     * @example 123
     * @var string
     */
    public $id;

}
