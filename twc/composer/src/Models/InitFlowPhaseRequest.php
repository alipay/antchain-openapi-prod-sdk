<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class InitFlowPhaseRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 流程id，通过twc.notary.instance.create(创建存证流程实例)获取
    /**
     * @var string
     */
    public $flowId;

    // 阶段编号，与模板阶段编号保持一致，不同阶段阶段编号不一样，要与阶段存证内容保持一致
    /**
     * @var int
     */
    public $phaseNo;

    // 阶段存证内容，如果模板数据类型定义是Hash(哈希)则填入Hash即可，如果定义是Structure(结构化)，则填入模板所有字段json对象的字符串Base64后的值
    /**
     * @var string
     */
    public $notaryContent;

    // 业务方原始数据ID，方便与业务方进行数据核对使用
    /**
     * @var string
     */
    public $originDataId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'phaseNo'           => 'phase_no',
        'notaryContent'     => 'notary_content',
        'originDataId'      => 'origin_data_id',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('phaseNo', $this->phaseNo, true);
        Model::validateRequired('notaryContent', $this->notaryContent, true);
        Model::validateRequired('originDataId', $this->originDataId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->phaseNo) {
            $res['phase_no'] = $this->phaseNo;
        }
        if (null !== $this->notaryContent) {
            $res['notary_content'] = $this->notaryContent;
        }
        if (null !== $this->originDataId) {
            $res['origin_data_id'] = $this->originDataId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitFlowPhaseRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['phase_no'])) {
            $model->phaseNo = $map['phase_no'];
        }
        if (isset($map['notary_content'])) {
            $model->notaryContent = $map['notary_content'];
        }
        if (isset($map['origin_data_id'])) {
            $model->originDataId = $map['origin_data_id'];
        }

        return $model;
    }
}
