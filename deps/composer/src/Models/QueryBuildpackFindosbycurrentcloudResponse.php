<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryBuildpackFindosbycurrentcloudResponse extends Model
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

    // BuildpackOS
    /**
     * @var BuildpackOS[]
     */
    public $buildpackOs;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'buildpackOs' => 'buildpack_os',
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
        if (null !== $this->buildpackOs) {
            $res['buildpack_os'] = [];
            if (null !== $this->buildpackOs && \is_array($this->buildpackOs)) {
                $n = 0;
                foreach ($this->buildpackOs as $item) {
                    $res['buildpack_os'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBuildpackFindosbycurrentcloudResponse
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
        if (isset($map['buildpack_os'])) {
            if (!empty($map['buildpack_os'])) {
                $model->buildpackOs = [];
                $n                  = 0;
                foreach ($map['buildpack_os'] as $item) {
                    $model->buildpackOs[$n++] = null !== $item ? BuildpackOS::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
