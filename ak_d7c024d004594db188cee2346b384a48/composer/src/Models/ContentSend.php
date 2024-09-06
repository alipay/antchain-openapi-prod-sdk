<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d7c024d004594db188cee2346b384a48\Models;

use AlibabaCloud\Tea\Model;

class ContentSend extends Model
{
    // 单条手机号
    /**
     * @example 暂无
     *
     * @var string
     */
    public $mobile;

    // 最多支持 10 个变量
    // 文字变量在使用时有长度限制：
    // “纯中文变量 不超过 10 个字”
    // “数字 字母 英文符号 不超过 20 位”
    // “纯数字 不超过 20 位”
    // 有序的变量列表，按顺序替换报备的模板彩信文本帧中的变量，列表长度和变量个数不一致会导致替换变量错误
    /**
     * @example
     *
     * @var string[]
     */
    public $templateParamList;
    protected $_name = [
        'mobile'            => 'mobile',
        'templateParamList' => 'template_param_list',
    ];

    public function validate()
    {
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('templateParamList', $this->templateParamList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->templateParamList) {
            $res['template_param_list'] = $this->templateParamList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentSend
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['template_param_list'])) {
            if (!empty($map['template_param_list'])) {
                $model->templateParamList = $map['template_param_list'];
            }
        }

        return $model;
    }
}
