<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class QueryUserCertResponse extends Model {
    protected $_name = [
        'certIdList' => 'cert_id_list',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->certIdList) {
            $res['cert_id_list'] = [];
            if(null !== $this->certIdList){
                $res['cert_id_list'] = $this->certIdList;
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryUserCertResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cert_id_list'])){
            if(!empty($map['cert_id_list'])){
                $model->certIdList = [];
                $model->certIdList = $map['cert_id_list'];
            }
        }
        return $model;
    }
    /**
     * @description 证书id列表
     * @example 0001
     * @var array
     */
    public $certIdList;

}
