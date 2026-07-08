<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class PagequeryAuthAdminResponse extends Model
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

    // 授权策略配置
    /**
     * @var AuthorizePolicy[]
     */
    public $authorizePolicyList;

    // 总数量
    /**
     * @var int
     */
    public $total;

    // 当前页
    /**
     * @var int
     */
    public $pageNumber;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'authorizePolicyList' => 'authorize_policy_list',
        'total'               => 'total',
        'pageNumber'          => 'page_number',
        'pageSize'            => 'page_size',
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
        if (null !== $this->authorizePolicyList) {
            $res['authorize_policy_list'] = [];
            if (null !== $this->authorizePolicyList && \is_array($this->authorizePolicyList)) {
                $n = 0;
                foreach ($this->authorizePolicyList as $item) {
                    $res['authorize_policy_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryAuthAdminResponse
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
        if (isset($map['authorize_policy_list'])) {
            if (!empty($map['authorize_policy_list'])) {
                $model->authorizePolicyList = [];
                $n                          = 0;
                foreach ($map['authorize_policy_list'] as $item) {
                    $model->authorizePolicyList[$n++] = null !== $item ? AuthorizePolicy::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
