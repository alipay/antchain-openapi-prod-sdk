<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockanalysisEquityauthlistResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 商品授权信息（一客一价信息）列表
    /**
     * @var EquityAuthInfo[]
     */
    public $equityAuthList;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'equityAuthList' => 'equity_auth_list',
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
        if (null !== $this->equityAuthList) {
            $res['equity_auth_list'] = [];
            if (null !== $this->equityAuthList && \is_array($this->equityAuthList)) {
                $n = 0;
                foreach ($this->equityAuthList as $item) {
                    $res['equity_auth_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockanalysisEquityauthlistResponse
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
        if (isset($map['equity_auth_list'])) {
            if (!empty($map['equity_auth_list'])) {
                $model->equityAuthList = [];
                $n                     = 0;
                foreach ($map['equity_auth_list'] as $item) {
                    $model->equityAuthList[$n++] = null !== $item ? EquityAuthInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
