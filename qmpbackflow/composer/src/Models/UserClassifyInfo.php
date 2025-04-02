<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UserClassifyInfo extends Model
{
    // 版本号
    /**
     * @example V1
     *
     * @var string
     */
    public $version;

    // 流量分层
    /**
     * @example A: <6% B: 6%~12% C:12%~18% D:18%~24% E:24%~36% F:>36% R:不分发（黑名单类）
     *
     * @var string
     */
    public $rateClassify;

    // 流量扩展分层1
    /**
     * @example 123123
     *
     * @var string
     */
    public $classifyExt1;

    // 流量扩展分层2
    /**
     * @example 123
     *
     * @var string
     */
    public $classifyExt2;
    protected $_name = [
        'version'      => 'version',
        'rateClassify' => 'rate_classify',
        'classifyExt1' => 'classify_ext1',
        'classifyExt2' => 'classify_ext2',
    ];

    public function validate()
    {
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('rateClassify', $this->rateClassify, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->rateClassify) {
            $res['rate_classify'] = $this->rateClassify;
        }
        if (null !== $this->classifyExt1) {
            $res['classify_ext1'] = $this->classifyExt1;
        }
        if (null !== $this->classifyExt2) {
            $res['classify_ext2'] = $this->classifyExt2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserClassifyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['rate_classify'])) {
            $model->rateClassify = $map['rate_classify'];
        }
        if (isset($map['classify_ext1'])) {
            $model->classifyExt1 = $map['classify_ext1'];
        }
        if (isset($map['classify_ext2'])) {
            $model->classifyExt2 = $map['classify_ext2'];
        }

        return $model;
    }
}
