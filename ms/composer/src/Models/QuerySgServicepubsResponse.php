<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QuerySgServicepubsResponse extends Model
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

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // [
    // {
    // "gmtModified":"2019-12-12T20:58:26+08:00",
    // "alive":true,
    // "hostIp":"10.15.228.102",
    // "appName":"aliyun-demo",
    // "weight":100,
    // "gmtCreate":"2019-12-12T20:58:26+08:00",
    // "content":"10.15.228.96:12200?rpcVer=50303&serialization=hessian2&weight=100&timeout=3000&appName=aliyun-demo&warmupTime=0&warmupWeight=10&p=1&v=4.0&_SERIALIZETYPE=hessian2&_WEIGHT=100&_TIMEOUT=3000&app_name=aliyun-demo&startTime=1576047463993",
    // "mosn":false,
    // "timeout":3000,
    // "serviceIp":"10.15.228.96",
    // "protocol":"bolt",
    // "instanceId":"0SGTOGOOLRD8",
    // "dataId":"com.antfin.demo.endpoint.facade.SampleRestFacade:1.0@DEFAULT",
    // "processId":"10.15.228.102:64638",
    // "zone":"DEFAULT_ZONE",
    // "checkSum":"d7e0e231f57d1156fe4a4f0979231fe5",
    // "vmMode":false,
    // "id":969,
    // "servicePort":12200,
    // "status":true
    // }
    /**
     * @var Publisher[]
     */
    public $publishers;

    // 起始索引
    /**
     * @var int
     */
    public $startIndex;

    // 总条数
    /**
     * @var int
     */
    public $totalSize;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'currentPage' => 'current_page',
        'pageSize'    => 'page_size',
        'publishers'  => 'publishers',
        'startIndex'  => 'start_index',
        'totalSize'   => 'total_size',
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
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->publishers) {
            $res['publishers'] = [];
            if (null !== $this->publishers && \is_array($this->publishers)) {
                $n = 0;
                foreach ($this->publishers as $item) {
                    $res['publishers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->startIndex) {
            $res['start_index'] = $this->startIndex;
        }
        if (null !== $this->totalSize) {
            $res['total_size'] = $this->totalSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySgServicepubsResponse
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
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['publishers'])) {
            if (!empty($map['publishers'])) {
                $model->publishers = [];
                $n                 = 0;
                foreach ($map['publishers'] as $item) {
                    $model->publishers[$n++] = null !== $item ? Publisher::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['start_index'])) {
            $model->startIndex = $map['start_index'];
        }
        if (isset($map['total_size'])) {
            $model->totalSize = $map['total_size'];
        }

        return $model;
    }
}
