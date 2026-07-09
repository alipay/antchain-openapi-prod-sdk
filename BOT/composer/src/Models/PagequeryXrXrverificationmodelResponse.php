<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PagequeryXrXrverificationmodelResponse extends Model
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

    // 核销实例列表
    /**
     * @var XrVerificationModelVo[]
     */
    public $xrVerificationModelList;

    // 当前页
    /**
     * @var int
     */
    public $current;

    // 每页数据量
    /**
     * @var int
     */
    public $pageSize;

    // 数据总条数
    /**
     * @var int
     */
    public $total;

    // 总页数
    /**
     * @var int
     */
    public $totalPage;
    protected $_name = [
        'reqMsgId'                => 'req_msg_id',
        'resultCode'              => 'result_code',
        'resultMsg'               => 'result_msg',
        'success'                 => 'success',
        'xrVerificationModelList' => 'xr_verification_model_list',
        'current'                 => 'current',
        'pageSize'                => 'page_size',
        'total'                   => 'total',
        'totalPage'               => 'total_page',
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
        if (null !== $this->xrVerificationModelList) {
            $res['xr_verification_model_list'] = [];
            if (null !== $this->xrVerificationModelList && \is_array($this->xrVerificationModelList)) {
                $n = 0;
                foreach ($this->xrVerificationModelList as $item) {
                    $res['xr_verification_model_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->totalPage) {
            $res['total_page'] = $this->totalPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryXrXrverificationmodelResponse
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
        if (isset($map['xr_verification_model_list'])) {
            if (!empty($map['xr_verification_model_list'])) {
                $model->xrVerificationModelList = [];
                $n                              = 0;
                foreach ($map['xr_verification_model_list'] as $item) {
                    $model->xrVerificationModelList[$n++] = null !== $item ? XrVerificationModelVo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['total_page'])) {
            $model->totalPage = $map['total_page'];
        }

        return $model;
    }
}
