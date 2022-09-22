<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class IdentityDistributed extends Model
{
    // 户籍身份证号(前两位标识)
    // 11代表北京市，12天代表天津市，13河北省，14山代表山西省，15内代表蒙古自治区，21代表辽宁省，22代表吉林省，23代表黑龙江省，31代表上海市，32代表江苏省，33代表浙江省，34代表代表安徽省，35代表福建省，36代表江西省，37代表山东省，41代表河南省，42代表湖北省，43代表湖南省，44代表广东省，45代表广西壮族自治区，46代表海南省，50代表重庆市，51代表四川省，52代表贵州省，53代表云南省，54代表西藏自治区，61代表陕西省，62代表甘肃省，63代表青海省，64代表宁夏回族自治区，65代表新疆维吾尔自治区，71代表台湾省，81代表香港特别行政区，82代表澳门特别行政区
    /**
     * @example 11
     *
     * @var string
     */
    public $key;

    // 户籍所在省分布数量
    /**
     * @example 100
     *
     * @var int
     */
    public $number;
    protected $_name = [
        'key'    => 'key',
        'number' => 'number',
    ];

    public function validate()
    {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('number', $this->number, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdentityDistributed
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['number'])) {
            $model->number = $map['number'];
        }

        return $model;
    }
}
