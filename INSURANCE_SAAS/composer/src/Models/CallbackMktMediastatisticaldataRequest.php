<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackMktMediastatisticaldataRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'requestId' => 'request_id',
        'projectId' => 'project_id',
        'mediaSource' => 'media_source',
        'dimension' => 'dimension',
        'statisticalDataList' => 'statistical_data_list',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('mediaSource', $this->mediaSource, true);
        Model::validateRequired('dimension', $this->dimension, true);
        Model::validateRequired('statisticalDataList', $this->statisticalDataList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->mediaSource) {
            $res['media_source'] = $this->mediaSource;
        }
        if (null !== $this->dimension) {
            $res['dimension'] = $this->dimension;
        }
        if (null !== $this->statisticalDataList) {
            $res['statistical_data_list'] = $this->statisticalDataList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackMktMediastatisticaldataRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['project_id'])){
            $model->projectId = $map['project_id'];
        }
        if(isset($map['media_source'])){
            $model->mediaSource = $map['media_source'];
        }
        if(isset($map['dimension'])){
            $model->dimension = $map['dimension'];
        }
        if(isset($map['statistical_data_list'])){
            $model->statisticalDataList = $map['statistical_data_list'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求id
    /**
     * @var string
     */
    public $requestId;

    // 项目id
    /**
     * @var string
     */
    public $projectId;

    // 数据渠道来源，广点通(gdt) / 巨量引擎(oceanengine) / 快手(kuaishou) / 百度(baidu)
    /**
     * @var string
     */
    public $mediaSource;

    // 统计维度，区分账号（ACCOUNT） 、广告计划(ADVERTISEMENT) 、 素材（MATERIAL）
    /**
     * @var string
     */
    public $dimension;

    // 统计数据
    /**
     * @var string
     */
    public $statisticalDataList;

}
