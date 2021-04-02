<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PullConsumerDatasourceResponse extends Model
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

    // 分页游标
    /**
     * @var string
     */
    public $cursor;

    // 数据包列表
    /**
     * @var DistributeDataPackage[]
     */
    public $dataPackageList;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'cursor'          => 'cursor',
        'dataPackageList' => 'data_package_list',
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
        if (null !== $this->cursor) {
            $res['cursor'] = $this->cursor;
        }
        if (null !== $this->dataPackageList) {
            $res['data_package_list'] = [];
            if (null !== $this->dataPackageList && \is_array($this->dataPackageList)) {
                $n = 0;
                foreach ($this->dataPackageList as $item) {
                    $res['data_package_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PullConsumerDatasourceResponse
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
        if (isset($map['cursor'])) {
            $model->cursor = $map['cursor'];
        }
        if (isset($map['data_package_list'])) {
            if (!empty($map['data_package_list'])) {
                $model->dataPackageList = [];
                $n                      = 0;
                foreach ($map['data_package_list'] as $item) {
                    $model->dataPackageList[$n++] = null !== $item ? DistributeDataPackage::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
