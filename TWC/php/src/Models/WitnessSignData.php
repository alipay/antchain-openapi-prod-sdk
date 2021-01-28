<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class WitnessSignData extends Model {
    protected $_name = [
        'sealFileKeys' => 'seal_file_keys',
        'sealIds' => 'seal_ids',
        'signHash' => 'sign_hash',
        'signPosData' => 'sign_pos_data',
        'thirdDocId' => 'third_doc_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->sealFileKeys) {
            $res['seal_file_keys'] = $this->sealFileKeys;
        }
        if (null !== $this->sealIds) {
            $res['seal_ids'] = $this->sealIds;
        }
        if (null !== $this->signHash) {
            $res['sign_hash'] = $this->signHash;
        }
        if (null !== $this->signPosData) {
            $res['sign_pos_data'] = $this->signPosData;
        }
        if (null !== $this->thirdDocId) {
            $res['third_doc_id'] = $this->thirdDocId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return WitnessSignData
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['seal_file_keys'])){
            if(!empty($map['seal_file_keys'])){
                $model->sealFileKeys = $map['seal_file_keys'];
            }
        }
        if(isset($map['seal_ids'])){
            if(!empty($map['seal_ids'])){
                $model->sealIds = $map['seal_ids'];
            }
        }
        if(isset($map['sign_hash'])){
            $model->signHash = $map['sign_hash'];
        }
        if(isset($map['sign_pos_data'])){
            $model->signPosData = $map['sign_pos_data'];
        }
        if(isset($map['third_doc_id'])){
            $model->thirdDocId = $map['third_doc_id'];
        }
        return $model;
    }
    // 印章图片fileKey列表
    /**
     * @example 
     * @var string[]
     */
    public $sealFileKeys;

    // 印章id列表
    /**
     * @example 
     * @var string[]
     */
    public $sealIds;

    // 待签署文档摘要值，批量签时必传
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269
     * @var string
     */
    public $signHash;

    // 签署位置信息
    /**
     * @example  
     * @var string
     */
    public $signPosData;

    // 第三方文档id，批量签时必传
    /**
     * @example  
     * @var string
     */
    public $thirdDocId;

}
