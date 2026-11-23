<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\Shot;

class Storyboard extends Model {
    protected $_name = [
        'shotIds' => 'shot_ids',
        'shots' => 'shots',
    ];
    public function validate() {
        Model::validateRequired('shotIds', $this->shotIds, true);
        Model::validateRequired('shots', $this->shots, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->shotIds) {
            $res['shot_ids'] = $this->shotIds;
        }
        if (null !== $this->shots) {
            $res['shots'] = [];
            if(null !== $this->shots && is_array($this->shots)){
                $n = 0;
                foreach($this->shots as $item){
                    $res['shots'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Storyboard
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['shot_ids'])){
            if(!empty($map['shot_ids'])){
                $model->shotIds = $map['shot_ids'];
            }
        }
        if(isset($map['shots'])){
            if(!empty($map['shots'])){
                $model->shots = [];
                $n = 0;
                foreach($map['shots'] as $item) {
                    $model->shots[$n++] = null !== $item ? Shot::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 分镜id集合
    /**
     * @example ["shot-001"]
     * @var string[]
     */
    public $shotIds;

    // 分镜集合
    /**
     * @example undefined
     * @var Shot[]
     */
    public $shots;

}
