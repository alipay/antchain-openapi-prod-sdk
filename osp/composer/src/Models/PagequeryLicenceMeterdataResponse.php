<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class PagequeryLicenceMeterdataResponse extends Model
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

    // 是否成功
    /**
     * @var bool
     */
    public $success;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;

    // 总页数
    /**
     * @var string
     */
    public $totalPage;

    // 计量数据
    /**
     * @var MeterDataModel[]
     */
    public $meterDataList;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'success'       => 'success',
        'currentPage'   => 'current_page',
        'totalPage'     => 'total_page',
        'meterDataList' => 'meter_data_list',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }
        if (null !== $this->meterDataList) {
            $res['meter_data_list'] = [];
            if (null !== $this->meterDataList && \is_array($this->meterDataList)) {
                $n = 0;
                foreach ($this->meterDataList as $item) {
                    $res['meter_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryLicenceMeterdataResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }
        if (isset($map['meter_data_list'])) {
            if (!empty($map['meter_data_list'])) {
                $model->meterDataList = [];
                $n                    = 0;
                foreach ($map['meter_data_list'] as $item) {
                    $model->meterDataList[$n++] = null !== $item ? MeterDataModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
