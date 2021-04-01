<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthOrgStatusResponse extends Model
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

    // 业务场景码类型
    /**
     * @var string
     */
    public $bizType;

    // 列表结果，其中每个元素是一个json的string，这个json实际就是数据源提供的数据上链之前的内容。
    //
    // [
    // {
    // "did": "did:mychain:b11dd863d31c38507d6cf8e615b897c7a9160d145e404b8a991964179c0e0bfd",
    // "orgName": "XX检查门诊-1",
    // "orgNo": "机构编号-1",
    // "logoUrl": "https://gw.alipayobjects.com/mdn/rms_40e4ff/afts/img/A*a8QOSJysDlsAAAAAAAAAAABkARQnAQ",
    // "status": 1
    // },
    // {
    // "did": "did:mychain:b11dd863d31c38507d6cf8e615b897c7a9160d145e404b8a991964179c0e0bfe",
    // "orgName": "XX检查门诊-2",
    // "orgNo": "机构编号-2",
    // "logoUrl": "https://gw.alipayobjects.com/mdn/rms_40e4ff/afts/img/A*a8QOSJysDlsAAAAAAAAAAABkARQnAQ",
    // "status": 0
    // }
    // ]
    /**
     * @var string[]
     */
    public $list;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'bizType'    => 'biz_type',
        'list'       => 'list',
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->list) {
            $res['list'] = $this->list;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthOrgStatusResponse
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = $map['list'];
            }
        }

        return $model;
    }
}
