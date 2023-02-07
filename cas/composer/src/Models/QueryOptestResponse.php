<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryOptestResponse extends Model
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

    // str
    /**
     * @var string
     */
    public $str;

    // lon
    /**
     * @var int
     */
    public $lon;

    // stru
    /**
     * @var VPC
     */
    public $stru;

    // arr_str
    /**
     * @var string[]
     */
    public $arrStr;

    // arr_stru
    /**
     * @var VPC[]
     */
    public $arrStru;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'str'        => 'str',
        'lon'        => 'lon',
        'stru'       => 'stru',
        'arrStr'     => 'arr_str',
        'arrStru'    => 'arr_stru',
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
        if (null !== $this->str) {
            $res['str'] = $this->str;
        }
        if (null !== $this->lon) {
            $res['lon'] = $this->lon;
        }
        if (null !== $this->stru) {
            $res['stru'] = null !== $this->stru ? $this->stru->toMap() : null;
        }
        if (null !== $this->arrStr) {
            $res['arr_str'] = $this->arrStr;
        }
        if (null !== $this->arrStru) {
            $res['arr_stru'] = [];
            if (null !== $this->arrStru && \is_array($this->arrStru)) {
                $n = 0;
                foreach ($this->arrStru as $item) {
                    $res['arr_stru'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOptestResponse
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
        if (isset($map['str'])) {
            $model->str = $map['str'];
        }
        if (isset($map['lon'])) {
            $model->lon = $map['lon'];
        }
        if (isset($map['stru'])) {
            $model->stru = VPC::fromMap($map['stru']);
        }
        if (isset($map['arr_str'])) {
            if (!empty($map['arr_str'])) {
                $model->arrStr = $map['arr_str'];
            }
        }
        if (isset($map['arr_stru'])) {
            if (!empty($map['arr_stru'])) {
                $model->arrStru = [];
                $n              = 0;
                foreach ($map['arr_stru'] as $item) {
                    $model->arrStru[$n++] = null !== $item ? VPC::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
