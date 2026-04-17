<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class QueryUsedcarProductsResponse extends Model
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

    // 状态码
    /**
     * @var string
     */
    public $code;

    // 状态信息
    /**
     * @var string
     */
    public $msg;

    // 车系名
    /**
     * @var string
     */
    public $seriesname;

    // 车系id
    /**
     * @var string
     */
    public $seriesid;

    // 车型信息
    /**
     * @var ProductInfo[]
     */
    public $productlist;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'code'        => 'code',
        'msg'         => 'msg',
        'seriesname'  => 'seriesname',
        'seriesid'    => 'seriesid',
        'productlist' => 'productlist',
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
        if (null !== $this->seriesname) {
            $res['seriesname'] = $this->seriesname;
        }
        if (null !== $this->seriesid) {
            $res['seriesid'] = $this->seriesid;
        }
        if (null !== $this->productlist) {
            $res['productlist'] = [];
            if (null !== $this->productlist && \is_array($this->productlist)) {
                $n = 0;
                foreach ($this->productlist as $item) {
                    $res['productlist'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUsedcarProductsResponse
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
        if (isset($map['seriesname'])) {
            $model->seriesname = $map['seriesname'];
        }
        if (isset($map['seriesid'])) {
            $model->seriesid = $map['seriesid'];
        }
        if (isset($map['productlist'])) {
            if (!empty($map['productlist'])) {
                $model->productlist = [];
                $n                  = 0;
                foreach ($map['productlist'] as $item) {
                    $model->productlist[$n++] = null !== $item ? ProductInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
