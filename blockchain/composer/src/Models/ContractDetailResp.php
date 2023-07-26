<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractDetailResp extends Model
{
    // 合约标识
    /**
     * @example cme20230724104931af3a4d
     *
     * @var string
     */
    public $serviceId;

    // 合约服务名称
    /**
     * @example 存证合约
     *
     * @var string
     */
    public $name;

    // 创建人
    /**
     * @example 张三
     *
     * @var string
     */
    public $creator;

    // 创建时间
    /**
     * @example 1690166971465
     *
     * @var int
     */
    public $createTime;

    // 订购产品
    /**
     * @example 存证合约服务
     *
     * @var string
     */
    public $orderingProducts;

    // 关联区块链id
    /**
     * @example 284f75bc-8069-443f-9d46-4576bb15f210
     *
     * @var string
     */
    public $chanId;

    // 合约状态
    /**
     * @example DEPLOYED
     *
     * @var string
     */
    public $contractStatus;

    // 合约部署进度当前状态
    /**
     * @example SERVICE_START
     *
     * @var string
     */
    public $status;

    // 合约部署进度
    /**
     * @example
     *
     * @var InstanceProgressInfo[]
     */
    public $progressInfoList;

    // 实例最近调用记录(暂缓，先不做)
    /**
     * @example
     *
     * @var InstanceRecordInfo[]
     */
    public $recordInfoList;
    protected $_name = [
        'serviceId'        => 'service_id',
        'name'             => 'name',
        'creator'          => 'creator',
        'createTime'       => 'create_time',
        'orderingProducts' => 'ordering_products',
        'chanId'           => 'chan_id',
        'contractStatus'   => 'contract_status',
        'status'           => 'status',
        'progressInfoList' => 'progress_info_list',
        'recordInfoList'   => 'record_info_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->orderingProducts) {
            $res['ordering_products'] = $this->orderingProducts;
        }
        if (null !== $this->chanId) {
            $res['chan_id'] = $this->chanId;
        }
        if (null !== $this->contractStatus) {
            $res['contract_status'] = $this->contractStatus;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->progressInfoList) {
            $res['progress_info_list'] = [];
            if (null !== $this->progressInfoList && \is_array($this->progressInfoList)) {
                $n = 0;
                foreach ($this->progressInfoList as $item) {
                    $res['progress_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->recordInfoList) {
            $res['record_info_list'] = [];
            if (null !== $this->recordInfoList && \is_array($this->recordInfoList)) {
                $n = 0;
                foreach ($this->recordInfoList as $item) {
                    $res['record_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractDetailResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['ordering_products'])) {
            $model->orderingProducts = $map['ordering_products'];
        }
        if (isset($map['chan_id'])) {
            $model->chanId = $map['chan_id'];
        }
        if (isset($map['contract_status'])) {
            $model->contractStatus = $map['contract_status'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['progress_info_list'])) {
            if (!empty($map['progress_info_list'])) {
                $model->progressInfoList = [];
                $n                       = 0;
                foreach ($map['progress_info_list'] as $item) {
                    $model->progressInfoList[$n++] = null !== $item ? InstanceProgressInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['record_info_list'])) {
            if (!empty($map['record_info_list'])) {
                $model->recordInfoList = [];
                $n                     = 0;
                foreach ($map['record_info_list'] as $item) {
                    $model->recordInfoList[$n++] = null !== $item ? InstanceRecordInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
