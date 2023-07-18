<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclContractFlowInfo extends Model
{
    // 合同主题
    // 注：名称不支持以下9个字符：/ \ : * " < > | ？
    /**
     * @example 主题信息
     *
     * @var string
     */
    public $businessScene;

    // 流程中的签署文件信息，只支持一个文件
    /**
     * @example
     *
     * @var BclContractFileInfo[]
     */
    public $fileInfo;

    // 签署平台，ALIPAY（支付宝小程序）或H5，默认H5
    /**
     * @example ALIPAY
     *
     * @var string
     */
    public $signPlatform;

    // 收款方的ID，调用创建收款方接口获得
    /**
     * @example PROD1112
     *
     * @var string
     */
    public $payeeId;
    protected $_name = [
        'businessScene' => 'business_scene',
        'fileInfo'      => 'file_info',
        'signPlatform'  => 'sign_platform',
        'payeeId'       => 'payee_id',
    ];

    public function validate()
    {
        Model::validateRequired('businessScene', $this->businessScene, true);
        Model::validateRequired('fileInfo', $this->fileInfo, true);
        Model::validateRequired('payeeId', $this->payeeId, true);
        Model::validateMaxLength('businessScene', $this->businessScene, 32);
        Model::validateMaxLength('signPlatform', $this->signPlatform, 8);
        Model::validateMaxLength('payeeId', $this->payeeId, 32);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->businessScene) {
            $res['business_scene'] = $this->businessScene;
        }
        if (null !== $this->fileInfo) {
            $res['file_info'] = [];
            if (null !== $this->fileInfo && \is_array($this->fileInfo)) {
                $n = 0;
                foreach ($this->fileInfo as $item) {
                    $res['file_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->signPlatform) {
            $res['sign_platform'] = $this->signPlatform;
        }
        if (null !== $this->payeeId) {
            $res['payee_id'] = $this->payeeId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclContractFlowInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['business_scene'])) {
            $model->businessScene = $map['business_scene'];
        }
        if (isset($map['file_info'])) {
            if (!empty($map['file_info'])) {
                $model->fileInfo = [];
                $n               = 0;
                foreach ($map['file_info'] as $item) {
                    $model->fileInfo[$n++] = null !== $item ? BclContractFileInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sign_platform'])) {
            $model->signPlatform = $map['sign_platform'];
        }
        if (isset($map['payee_id'])) {
            $model->payeeId = $map['payee_id'];
        }

        return $model;
    }
}
