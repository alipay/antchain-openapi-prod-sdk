<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

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

    // 变量⻓度限制：
    // “纯中⽂ 不超过 10 个字”；“数字 字⺟ 英⽂符号 不超过20 位”； “纯数字 不超过20 位” ；
    // 有序的变量值列表，按顺序替换报备的模板短信⽂本帧中的变量，列表⻓度和变量个数不⼀致会导致替换变量错误
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
