<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BAASDT\Models\DelegateRelationInfo;

class QueryBlockanalysisDelegaterelationResponse extends Model {
    protected $_name = [
        'delegateRelationInfos' => 'delegate_relation_infos',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->delegateRelationInfos) {
            $res['delegate_relation_infos'] = [];
            if(null !== $this->delegateRelationInfos && is_array($this->delegateRelationInfos)){
                $n = 0;
                foreach($this->delegateRelationInfos as $item){
                    $res['delegate_relation_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBlockanalysisDelegaterelationResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['delegate_relation_infos'])){
            if(!empty($map['delegate_relation_infos'])){
                $model->delegateRelationInfos = [];
                $n = 0;
                foreach($map['delegate_relation_infos'] as $item) {
                    $model->delegateRelationInfos[$n++] = null !== $item ? DelegateRelationInfo::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description 代理授权关系信息
     * @example 
     * @var array
     */
    public $delegateRelationInfos;

}
