<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class QueryAppparamResponse extends Model
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

    // 环境id
    /**
     * @var string
     */
    public $envId;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 启动参数的key-value列表
    /**
     * @var ParamData[]
     */
    public $appParams;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'envId'      => 'env_id',
        'prodCode'   => 'prod_code',
        'appName'    => 'app_name',
        'appParams'  => 'app_params',
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
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appParams) {
            $res['app_params'] = [];
            if (null !== $this->appParams && \is_array($this->appParams)) {
                $n = 0;
                foreach ($this->appParams as $item) {
                    $res['app_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppparamResponse
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
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_params'])) {
            if (!empty($map['app_params'])) {
                $model->appParams = [];
                $n                = 0;
                foreach ($map['app_params'] as $item) {
                    $model->appParams[$n++] = null !== $item ? ParamData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
