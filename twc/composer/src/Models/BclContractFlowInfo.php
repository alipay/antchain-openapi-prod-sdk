<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclContractFlowInfo extends Model
{
    // 合同主题
    // 注：名称不支持以下9个字符：/ \ : * " < > | ？
    // 仅当使用合同服务时必填
    /**
     * @example 主题信息
     *
     * @var string
     */
    public $businessScene;

    // 流程中的签署文件信息
    // 本期只支持一个文件
    // 仅当使用合同服务时必填
    /**
     * @example
     *
     * @var BclContractFileInfo[]
     */
    public $fileInfo;

    // 签署失败时的跳转地址
    // 如果不做单独配置，默认与redirect_url一致
    /**
     * @example http://www.xxx.com
     *
     * @var string
     */
    public $redirectUrlOnFailure;

    // 流程结束后的默认重定向地址
    // 默认签署完成停在当前页面
    /**
     * @example http://www.xxx.com
     *
     * @var string
     */
    public $redirectUrl;
    protected $_name = [
        'businessScene'        => 'business_scene',
        'fileInfo'             => 'file_info',
        'redirectUrlOnFailure' => 'redirect_url_on_failure',
        'redirectUrl'          => 'redirect_url',
    ];

    public function validate()
    {
        Model::validateMaxLength('businessScene', $this->businessScene, 32);
        Model::validateMaxLength('redirectUrlOnFailure', $this->redirectUrlOnFailure, 512);
        Model::validateMaxLength('redirectUrl', $this->redirectUrl, 512);
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
        if (null !== $this->redirectUrlOnFailure) {
            $res['redirect_url_on_failure'] = $this->redirectUrlOnFailure;
        }
        if (null !== $this->redirectUrl) {
            $res['redirect_url'] = $this->redirectUrl;
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
        if (isset($map['redirect_url_on_failure'])) {
            $model->redirectUrlOnFailure = $map['redirect_url_on_failure'];
        }
        if (isset($map['redirect_url'])) {
            $model->redirectUrl = $map['redirect_url'];
        }

        return $model;
    }
}
