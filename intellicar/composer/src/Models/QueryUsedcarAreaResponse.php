<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class QueryUsedcarAreaResponse extends Model
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

    // 响应码
    /**
     * @var string
     */
    public $code;

    // 响应信息
    /**
     * @var string
     */
    public $msg;

    // 省份集合
    /**
     * @var Province[]
     */
    public $province;

    // 城市集合
    /**
     * @var City[]
     */
    public $city;

    // 区县集合
    /**
     * @var County[]
     */
    public $county;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'code'       => 'code',
        'msg'        => 'msg',
        'province'   => 'province',
        'city'       => 'city',
        'county'     => 'county',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->province) {
            $res['province'] = [];
            if (null !== $this->province && \is_array($this->province)) {
                $n = 0;
                foreach ($this->province as $item) {
                    $res['province'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->city) {
            $res['city'] = [];
            if (null !== $this->city && \is_array($this->city)) {
                $n = 0;
                foreach ($this->city as $item) {
                    $res['city'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->county) {
            $res['county'] = [];
            if (null !== $this->county && \is_array($this->county)) {
                $n = 0;
                foreach ($this->county as $item) {
                    $res['county'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUsedcarAreaResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['province'])) {
            if (!empty($map['province'])) {
                $model->province = [];
                $n               = 0;
                foreach ($map['province'] as $item) {
                    $model->province[$n++] = null !== $item ? Province::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['city'])) {
            if (!empty($map['city'])) {
                $model->city = [];
                $n           = 0;
                foreach ($map['city'] as $item) {
                    $model->city[$n++] = null !== $item ? City::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['county'])) {
            if (!empty($map['county'])) {
                $model->county = [];
                $n             = 0;
                foreach ($map['county'] as $item) {
                    $model->county[$n++] = null !== $item ? County::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
