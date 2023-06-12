<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DetailEcarOffsetdatumResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 碳补偿项目编码
    /**
     * @var string
     */
    public $projectNo;

    // 碳普惠项目名称
    /**
     * @var string
     */
    public $projectName;

    // 会员账户DID
    /**
     * @var string
     */
    public $accountDid;

    // 采集数据单号
    //
    /**
     * @var string
     */
    public $acquisitionItemNo;

    // 发生时间
    /**
     * @var string
     */
    public $occurrentTime;

    // 发生场景编码
    /**
     * @var string
     */
    public $scenarioCode;

    // 发生场景名称
    /**
     * @var string
     */
    public $scenarioName;

    // 碳普惠平台编码，如果非平台采集数据，则显示为自采编码：Self
    /**
     * @var string
     */
    public $platformNo;

    // 减碳量
    /**
     * @var string
     */
    public $offsetVolume;

    // 碳能量值
    /**
     * @var int
     */
    public $carbonEnergy;

    // 活动数据详情列表
    /**
     * @var CarbonOffsetActiveDataDetail[]
     */
    public $activeDataList;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'projectNo'         => 'project_no',
        'projectName'       => 'project_name',
        'accountDid'        => 'account_did',
        'acquisitionItemNo' => 'acquisition_item_no',
        'occurrentTime'     => 'occurrent_time',
        'scenarioCode'      => 'scenario_code',
        'scenarioName'      => 'scenario_name',
        'platformNo'        => 'platform_no',
        'offsetVolume'      => 'offset_volume',
        'carbonEnergy'      => 'carbon_energy',
        'activeDataList'    => 'active_data_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->projectNo) {
            $res['project_no'] = $this->projectNo;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->accountDid) {
            $res['account_did'] = $this->accountDid;
        }
        if (null !== $this->acquisitionItemNo) {
            $res['acquisition_item_no'] = $this->acquisitionItemNo;
        }
        if (null !== $this->occurrentTime) {
            $res['occurrent_time'] = $this->occurrentTime;
        }
        if (null !== $this->scenarioCode) {
            $res['scenario_code'] = $this->scenarioCode;
        }
        if (null !== $this->scenarioName) {
            $res['scenario_name'] = $this->scenarioName;
        }
        if (null !== $this->platformNo) {
            $res['platform_no'] = $this->platformNo;
        }
        if (null !== $this->offsetVolume) {
            $res['offset_volume'] = $this->offsetVolume;
        }
        if (null !== $this->carbonEnergy) {
            $res['carbon_energy'] = $this->carbonEnergy;
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
     * @return DetailEcarOffsetdatumResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['project_no'])) {
            $model->projectNo = $map['project_no'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['account_did'])) {
            $model->accountDid = $map['account_did'];
        }
        if (isset($map['acquisition_item_no'])) {
            $model->acquisitionItemNo = $map['acquisition_item_no'];
        }
        if (isset($map['occurrent_time'])) {
            $model->occurrentTime = $map['occurrent_time'];
        }
        if (isset($map['scenario_code'])) {
            $model->scenarioCode = $map['scenario_code'];
        }
        if (isset($map['scenario_name'])) {
            $model->scenarioName = $map['scenario_name'];
        }
        if (isset($map['platform_no'])) {
            $model->platformNo = $map['platform_no'];
        }
        if (isset($map['offset_volume'])) {
            $model->offsetVolume = $map['offset_volume'];
        }
        if (isset($map['carbon_energy'])) {
            $model->carbonEnergy = $map['carbon_energy'];
        }
        if (isset($map['active_data_list'])) {
            if (!empty($map['active_data_list'])) {
                $model->activeDataList = [];
                $n                     = 0;
                foreach ($map['active_data_list'] as $item) {
                    $model->activeDataList[$n++] = null !== $item ? CarbonOffsetActiveDataDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
