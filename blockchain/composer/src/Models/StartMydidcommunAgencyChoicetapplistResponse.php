<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartMydidcommunAgencyChoicetapplistResponse extends Model
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

    // 之前did的版本号，在更新时会使用到
    /**
     * @var int
     */
    public $preVersion;

    // 对应servic info
    /**
     * @var DisServicesInfo[]
     */
    public $serviceList;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'preVersion'  => 'pre_version',
        'serviceList' => 'service_list',
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
        if (null !== $this->preVersion) {
            $res['pre_version'] = $this->preVersion;
        }
        if (null !== $this->serviceList) {
            $res['service_list'] = [];
            if (null !== $this->serviceList && \is_array($this->serviceList)) {
                $n = 0;
                foreach ($this->serviceList as $item) {
                    $res['service_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartMydidcommunAgencyChoicetapplistResponse
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
        if (isset($map['pre_version'])) {
            $model->preVersion = $map['pre_version'];
        }
        if (isset($map['service_list'])) {
            if (!empty($map['service_list'])) {
                $model->serviceList = [];
                $n                  = 0;
                foreach ($map['service_list'] as $item) {
                    $model->serviceList[$n++] = null !== $item ? DisServicesInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
