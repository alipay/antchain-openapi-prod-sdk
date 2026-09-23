<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVESERVICE\Models;

use AlibabaCloud\Tea\Model;

class CallTags extends Model {
    protected $_name = [
        'primaryTag' => 'primary_tag',
        'secondaryTag' => 'secondary_tag',
    ];
    public function validate() {
        Model::validateRequired('primaryTag', $this->primaryTag, true);
        Model::validateRequired('secondaryTag', $this->secondaryTag, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->primaryTag) {
            $res['primary_tag'] = $this->primaryTag;
        }
        if (null !== $this->secondaryTag) {
            $res['secondary_tag'] = $this->secondaryTag;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallTags
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['primary_tag'])){
            $model->primaryTag = $map['primary_tag'];
        }
        if(isset($map['secondary_tag'])){
            $model->secondaryTag = $map['secondary_tag'];
        }
        return $model;
    }
    // 一级标签
    /**
     * @example ""
     * @var string
     */
    public $primaryTag;

    // 二级标签
    /**
     * @example ""
     * @var string
     */
    public $secondaryTag;

}
