<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AddEcarOffsetacquisitionRequest extends Model
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

    // 活动数据采集单号
    /**
     * @var string
     */
    public $acquisitionItemNo;

    // 碳普惠减碳项目编号
    /**
     * @var string
     */
    public $projectNo;

    // 参与的碳账户DID
    /**
     * @var string
     */
    public $accountDid;

    // 发生时间，格式为yyyy-MM-DD HH:MM:SS（到秒）或 yyyy-MM-DD（按日录入）
    /**
     * @var string
     */
    public $occurrentTime;

    // 发生场景，需要按照约定的场景编码提交
    /**
     * @var string
     */
    public $scenarioCode;

    // 活动数据列表
    /**
     * @var AnyAmountItem[]
     */
    public $activeDataList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'acquisitionItemNo' => 'acquisition_item_no',
        'projectNo'         => 'project_no',
        'accountDid'        => 'account_did',
        'occurrentTime'     => 'occurrent_time',
        'scenarioCode'      => 'scenario_code',
        'activeDataList'    => 'active_data_list',
    ];

    public function validate()
    {
        Model::validateRequired('acquisitionItemNo', $this->acquisitionItemNo, true);
        Model::validateRequired('projectNo', $this->projectNo, true);
        Model::validateRequired('accountDid', $this->accountDid, true);
        Model::validateRequired('occurrentTime', $this->occurrentTime, true);
        Model::validateRequired('scenarioCode', $this->scenarioCode, true);
        Model::validateRequired('activeDataList', $this->activeDataList, true);
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
        if (null !== $this->acquisitionItemNo) {
            $res['acquisition_item_no'] = $this->acquisitionItemNo;
        }
        if (null !== $this->projectNo) {
            $res['project_no'] = $this->projectNo;
        }
        if (null !== $this->accountDid) {
            $res['account_did'] = $this->accountDid;
        }
        if (null !== $this->occurrentTime) {
            $res['occurrent_time'] = $this->occurrentTime;
        }
        if (null !== $this->scenarioCode) {
            $res['scenario_code'] = $this->scenarioCode;
        }
        if (null !== $this->activeDataList) {
            $res['active_data_list'] = [];
            if (null !== $this->activeDataList && \is_array($this->activeDataList)) {
                $n = 0;
                foreach ($this->activeDataList as $item) {
                    $res['active_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddEcarOffsetacquisitionRequest
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
        if (isset($map['acquisition_item_no'])) {
            $model->acquisitionItemNo = $map['acquisition_item_no'];
        }
        if (isset($map['project_no'])) {
            $model->projectNo = $map['project_no'];
        }
        if (isset($map['account_did'])) {
            $model->accountDid = $map['account_did'];
        }
        if (isset($map['occurrent_time'])) {
            $model->occurrentTime = $map['occurrent_time'];
        }
        if (isset($map['scenario_code'])) {
            $model->scenarioCode = $map['scenario_code'];
        }
        if (isset($map['active_data_list'])) {
            if (!empty($map['active_data_list'])) {
                $model->activeDataList = [];
                $n                     = 0;
                foreach ($map['active_data_list'] as $item) {
                    $model->activeDataList[$n++] = null !== $item ? AnyAmountItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
