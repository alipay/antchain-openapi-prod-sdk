<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AccessScopeItem extends Model {
    protected $_name = [
        'scene' => 'scene',
        'targets' => 'targets',
    ];
    public function validate() {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('targets', $this->targets, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->targets) {
            $res['targets'] = $this->targets;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AccessScopeItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['targets'])){
            if(!empty($map['targets'])){
                $model->targets = $map['targets'];
            }
        }
        return $model;
    }
    // 场景码。范围项归属的业务场景，同一请求内可以出现多个不同场景的范围项。
    /**
     * @example SCENE_001
     * @var string
     */
    public $scene;

    // 访问目标 ID 清单
    /**
     * @example ["dev-8801","dev-8802"]
     * @var string[]
     */
    public $targets;

}
