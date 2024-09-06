<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskResponse extends Model
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

    // 模型结果详情
    /**
     * @var RiskModel[]
     */
    public $models;

    // 智租风控-风控模型结果
    /**
     * @var AppletRiskModel
     */
    public $appletModel;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'models'      => 'models',
        'appletModel' => 'applet_model',
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
        if (null !== $this->models) {
            $res['models'] = [];
            if (null !== $this->models && \is_array($this->models)) {
                $n = 0;
                foreach ($this->models as $item) {
                    $res['models'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->appletModel) {
            $res['applet_model'] = null !== $this->appletModel ? $this->appletModel->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskResponse
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
        if (isset($map['models'])) {
            if (!empty($map['models'])) {
                $model->models = [];
                $n             = 0;
                foreach ($map['models'] as $item) {
                    $model->models[$n++] = null !== $item ? RiskModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['applet_model'])) {
            $model->appletModel = AppletRiskModel::fromMap($map['applet_model']);
        }

        return $model;
    }
}
