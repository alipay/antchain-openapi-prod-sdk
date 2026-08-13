<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryTdiaiworkshopcloudBatchRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'eventCode' => 'event_code',
        'dispModelCode' => 'disp_model_code',
        'queryDataIdList' => 'query_data_id_list',
    ];
    public function validate() {
        Model::validateRequired('eventCode', $this->eventCode, true);
        Model::validateRequired('dispModelCode', $this->dispModelCode, true);
        Model::validateRequired('queryDataIdList', $this->queryDataIdList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->dispModelCode) {
            $res['disp_model_code'] = $this->dispModelCode;
        }
        if (null !== $this->queryDataIdList) {
            $res['query_data_id_list'] = $this->queryDataIdList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTdiaiworkshopcloudBatchRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['event_code'])){
            $model->eventCode = $map['event_code'];
        }
        if(isset($map['disp_model_code'])){
            $model->dispModelCode = $map['disp_model_code'];
        }
        if(isset($map['query_data_id_list'])){
            if(!empty($map['query_data_id_list'])){
                $model->queryDataIdList = $map['query_data_id_list'];
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

    // 商品码（事件码）蚂蚁侧提供
    /**
     * @var string
     */
    public $eventCode;

    // 产品code
    /**
     * @var string
     */
    public $dispModelCode;

    // 要查询的dataIdList
    /**
     * @var string[]
     */
    public $queryDataIdList;

}
